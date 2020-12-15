package xtable;

// typed table access point
public class Role {
	Role() {
	}

	public static xbean.NameState get(String key) {
		return _Tables_.getInstance().role.get(key);
	}

	public static xbean.NameState get(String key, xbean.NameState value) {
		return _Tables_.getInstance().role.get(key, value);
	}

	public static void insert(String key, xbean.NameState value) {
		_Tables_.getInstance().role.insert(key, value);
	}

	public static void delete(String key) {
		_Tables_.getInstance().role.delete(key);
	}

	public static boolean add(String key, xbean.NameState value) {
		return _Tables_.getInstance().role.add(key, value);
	}

	public static boolean remove(String key) {
		return _Tables_.getInstance().role.remove(key);
	}

	public static xdb.TTableCache<String, xbean.NameState> getCache() {
		return _Tables_.getInstance().role.getCache();
	}

	public static xdb.TTable<String, xbean.NameState> getTable() {
		return _Tables_.getInstance().role;
	}

	public static xbean.NameState select(String key) {
		return getTable().select(key, new xdb.TField<xbean.NameState, xbean.NameState>() {
			public xbean.NameState get(xbean.NameState v) { return v.toData(); }
		});
	}

	public static Integer selectState(String key) {
		return getTable().select(key, new xdb.TField<xbean.NameState, Integer>() {
				public Integer get(xbean.NameState v) { return v.getState(); }
			});
	}

	public static Integer selectLocalid(String key) {
		return getTable().select(key, new xdb.TField<xbean.NameState, Integer>() {
				public Integer get(xbean.NameState v) { return v.getLocalid(); }
			});
	}

	public static String selectPeerip(String key) {
		return getTable().select(key, new xdb.TField<xbean.NameState, String>() {
				public String get(xbean.NameState v) { return v.getPeerip(); }
			});
	}

	public static Long selectTime(String key) {
		return getTable().select(key, new xdb.TField<xbean.NameState, Long>() {
				public Long get(xbean.NameState v) { return v.getTime(); }
			});
	}

}
