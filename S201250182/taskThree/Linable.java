package W02.S201250182.taskThree;

import W02.S201250182.taskThree.Matrix.Position;

/**
 * @interface 可排列的
 * @author Zyi
 * @create 2021/9/20 0:39
 */
@SuppressWarnings("JavaDoc")
public interface Linable {

    /**
     * 设置坐标
     * @param position 坐标
     */
    void setPosition(Position position);

    /**
     * 获取坐标
     * @return 坐标
     */
    Position getPosition();

    /**
     * 获取值
     * @return 值
     */
    int getValue();
}
