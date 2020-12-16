package xtable;

// typed table access point
public class Npcfightnum {
	Npcfightnum() {
	}

	public static Integer get(Long key) {
		return _Tables_.getInstance().npcfightnum.get(key);
	}

	public static Integer get(Long key, Integer value) {
		return _Tables_.getInstance().npcfightnum.get(key, value);
	}

	public static void insert(Long key, Integer value) {
		_Tables_.getInstance().npcfightnum.insert(key, value);
	}

	public static void delete(Long key) {
		_Tables_.getInstance().npcfightnum.delete(key);
	}

	public static boolean add(Long key, Integer value) {
		return _Tables_.getInstance().npcfightnum.add(key, value);
	}

	public static boolean remove(Long key) {
		return _Tables_.getInstance().npcfightnum.remove(key);
	}

	public static mkdb.TTableCache<Long, Integer> getCache() {
		return _Tables_.getInstance().npcfightnum.getCache();
	}

	public static mkdb.TTable<Long, Integer> getTable() {
		return _Tables_.getInstance().npcfightnum;
	}

	public static Integer select(Long key) {
		return getTable().select(key, new mkdb.TField<Integer, Integer>() {
			public Integer get(Integer v) { return v; }
		});
	}

}
