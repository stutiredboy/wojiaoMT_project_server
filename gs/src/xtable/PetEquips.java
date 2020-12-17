package xtable;

// typed table access point
public class PetEquips {
	PetEquips() {
	}

	public static mkdb.util.AutoKey<Long> getAutoKey() {
		return _Tables_.getInstance().petequips.getAutoKey();
	}

	public static Long nextKey() {
		return getAutoKey().next();
	}

	public static Long insert(xbean.PetEquip value) {
		Long next = nextKey();
		insert(next, value);
		return next;
	}

	public static xbean.PetEquip get(Long key) {
		return _Tables_.getInstance().petequips.get(key);
	}

	public static xbean.PetEquip get(Long key, xbean.PetEquip value) {
		return _Tables_.getInstance().petequips.get(key, value);
	}

	public static void insert(Long key, xbean.PetEquip value) {
		_Tables_.getInstance().petequips.insert(key, value);
	}

	public static void delete(Long key) {
		_Tables_.getInstance().petequips.delete(key);
	}

	public static boolean add(Long key, xbean.PetEquip value) {
		return _Tables_.getInstance().petequips.add(key, value);
	}

	public static boolean remove(Long key) {
		return _Tables_.getInstance().petequips.remove(key);
	}

	public static mkdb.TTableCache<Long, xbean.PetEquip> getCache() {
		return _Tables_.getInstance().petequips.getCache();
	}

	public static mkdb.TTable<Long, xbean.PetEquip> getTable() {
		return _Tables_.getInstance().petequips;
	}

	public static xbean.PetEquip select(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, xbean.PetEquip>() {
			public xbean.PetEquip get(xbean.PetEquip v) { return v.toData(); }
		});
	}

	public static Integer selectEquiplevel(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getEquiplevel(); }
			});
	}

	public static Integer selectRepairtimes(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getRepairtimes(); }
			});
	}

	public static Integer selectEndure(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getEndure(); }
			});
	}

	public static Integer selectCurmaxendure(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getCurmaxendure(); }
			});
	}

	public static String selectProducer(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, String>() {
				public String get(xbean.PetEquip v) { return v.getProducer(); }
			});
	}

	public static Integer selectExtendure(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getExtendure(); }
			});
	}

	public static Integer selectMaxendure(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getMaxendure(); }
			});
	}

	public static Integer selectSkill(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getSkill(); }
			});
	}

	public static Integer selectEffect(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getEffect(); }
			});
	}

	public static Integer selectTreasure(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getTreasure(); }
			});
	}

	public static java.util.Map<Integer, Integer> selectAttr(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, java.util.Map<Integer, Integer>>() {
				public java.util.Map<Integer, Integer> get(xbean.PetEquip v) { return v.getAttrAsData(); }
			});
	}

	public static java.util.Map<Integer, Integer> selectAddattr(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, java.util.Map<Integer, Integer>>() {
				public java.util.Map<Integer, Integer> get(xbean.PetEquip v) { return v.getAddattrAsData(); }
			});
	}

	public static java.util.Map<Integer, xbean.EnhancementData> selectEnhancement(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, java.util.Map<Integer, xbean.EnhancementData>>() {
				public java.util.Map<Integer, xbean.EnhancementData> get(xbean.PetEquip v) { return v.getEnhancementAsData(); }
			});
	}

	public static Integer selectEquipscore(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getEquipscore(); }
			});
	}

	public static java.util.List<Integer> selectDiamonds(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, java.util.List<Integer>>() {
				public java.util.List<Integer> get(xbean.PetEquip v) { return v.getDiamondsAsData(); }
			});
	}
	
	public static Integer selectSuitID(Long key) {
		return getTable().select(key, new mkdb.TField<xbean.PetEquip, Integer>() {
				public Integer get(xbean.PetEquip v) { return v.getSuitID(); }
			});
	}

}
