package fire.pb.util;

public final class EncodeBase64 extends Codec
{
	private static final byte[] ENCODE = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	private static final byte B64PAD = '=';

	private final Codec sink;
	private byte b0;
	private byte b1;
	private byte b2;
	private int n;

	public EncodeBase64(Codec sink)
	{
		this.sink = sink;
	}

	private byte[] update0(byte[] r, int j, byte[] data, int off, int len)
	{
		for (n = len; n > 2; n -= 3)
		{
			b0 = data[off++];
			b1 = data[off++];
			b2 = data[off++];
			int c = ((b0 & 0xff) << 16) | ((b1 & 0xff) << 8) | (b2 & 0xff);
			r[j++] = ENCODE[c >> 18];
			r[j++] = ENCODE[(c >> 12) & 0x3f];
			r[j++] = ENCODE[(c >> 6) & 0x3f];
			r[j++] = ENCODE[c & 0x3f];
		}
		if (n == 1)
		{
			b0 = data[off];
		}
		else if (n == 2)
		{
			b0 = data[off];
			b1 = data[off + 1];
		}
		return r;
	}

	private byte[] update1(byte[] r, byte[] data, int off, int len)
	{
		switch (len)
		{
		case 0:
			return r;
		case 1:
			b1 = data[off];
			n = 2;
			return r;
		}
		b1 = data[off];
		b2 = data[off + 1];
		int c = ((b0 & 0xff) << 16) | ((b1 & 0xff) << 8) | (b2 & 0xff);
		r[0] = ENCODE[c >> 18];
		r[1] = ENCODE[(c >> 12) & 0x3f];
		r[2] = ENCODE[(c >> 6) & 0x3f];
		r[3] = ENCODE[c & 0x3f];
		return update0(r, 4, data, off + 2, len - 2);
	}

	private byte[] update2(byte[] r, byte[] data, int off, int len)
	{
		if (len == 0)
			return r;
		b2 = data[off];
		int c = ((b0 & 0xff) << 16) | ((b1 & 0xff) << 8) | (b2 & 0xff);
		r[0] = ENCODE[c >> 18];
		r[1] = ENCODE[(c >> 12) & 0x3f];
		r[2] = ENCODE[(c >> 6) & 0x3f];
		r[3] = ENCODE[c & 0x3f];
		return update0(r, 4, data, off + 1, len - 1);
	}

	private byte[] update(byte[] r, byte[] data, int off, int len)
	{
		switch (n)
		{
		case 0:
			return update0(r, 0, data, off, len);
		case 1:
			return update1(r, data, off, len);
		}
		return update2(r, data, off, len);
	}

	@Override
	public void update(byte[] data, int off, int len)
	{
		sink.update(update(new byte[(len + n) / 3 * 4], data, off, len));
	}

	@Override
	public void flush()
	{
		int c;
		switch (n)
		{
		case 0:
			break;
		case 1:
			c = b0 & 0xff;
			byte[] r1 = { ENCODE[c >> 2], ENCODE[(c << 4) & 0x3f], B64PAD, B64PAD };
			sink.update(r1);
			break;
		case 2:
			c = ((b0 & 0xff) << 8) | (b1 & 0xff);
			byte[] r2 = { ENCODE[c >> 10], ENCODE[(c >> 4) & 0x3f], ENCODE[(c << 2) & 0x3f], B64PAD };
			sink.update(r2);
		}
		sink.flush();
		n = 0;
	}

	public static byte[] transform(byte[] data)
	{
		byte[] r = new byte[data.length / 3 * 4 + (data.length % 3 == 0 ? 0 : 4)];
		EncodeBase64 e = new EncodeBase64(null);
		e.update(r, data, 0, data.length);
		if (e.n == 1)
		{
			int c = e.b0 & 0xff;
			r[r.length - 4] = ENCODE[c >> 2];
			r[r.length - 3] = ENCODE[(c << 4) & 0x3f];
			r[r.length - 2] = B64PAD;
			r[r.length - 1] = B64PAD;
		}
		else if (e.n == 2)
		{
			int c = ((e.b0 & 0xff) << 8) | (e.b1 & 0xff);
			r[r.length - 4] = ENCODE[c >> 10];
			r[r.length - 3] = ENCODE[(c >> 4) & 0x3f];
			r[r.length - 2] = ENCODE[(c << 2) & 0x3f];
			r[r.length - 1] = B64PAD;
		}
		return r;
	}
}
