package robot.pos;

/**
 * 每个格子坐标描述一个阻挡点信息 主要用来进行阻挡判断，无其它功能
 * 
 */
public class GridPos extends BasePos {
	public GridPos(int x, int y) {
		super(x, y);
	}

	/**
	 * 获取格子中点
	 * 
	 * @param dest
	 * @return
	 */
	public GridPos getMidPos(GridPos dest) {
		return new GridPos((getX() + dest.getX()) / 2,
				(getY() + dest.getY()) / 2);
	}

	/**
	 * 
	 * @return 获取邻近格子坐标点，最多八个
	 */
	public java.util.List<GridPos> getAdjacentGridPos() {
		final java.util.List<GridPos> ret = new java.util.ArrayList<GridPos>();
		for (int i = getX() - 1; i <= getX() + 1; i++) {
			for (int j = getY() - 1; j <= getY() + 1; j++) {
				if (i >= 0 && j >= 0) {
					if (i != getX() || j != getY()) {
						ret.add(new GridPos(i, j));
					}
				}
			}
		}
		return ret;
	}

	/**
	 * 获取其顶点的逻辑坐标
	 * 
	 * @return
	 */
	public LogicPos toPosition() {
		return new LogicPos(getX() * GRID_WIDTH, getY() * GRID_HIGHTH);
	}

	public static final int GRID_WIDTH = 16; // 每个格子所占坐标宽度
	public static final int GRID_HIGHTH = 16; // 每个格子所占坐标高度
}
