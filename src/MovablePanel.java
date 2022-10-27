public class MovablePanel extends SimpleSizedPanel implements GameObject{

    public int getPreferredHeight() {
        return preferredHeight;
    }


    public MovablePanel(int x, int y) {
        super(x, y);
    }

    public MovablePanel() {
        super();
    }

    public boolean isLeftOf(GameObject that) {
        return this.getPos().x + this.getWidth() < that.getPos().x;
    }

    public boolean isAbove(GameObject that) {
        return this.getPos().y + this.getHeight() < that.getPos().y;
    }

    public boolean touches(GameObject that) {
        if (this.isLeftOf(that))
            return false;
        if (that.isLeftOf(this))
            return false;
        if (this.isAbove(that))
            return false;
        if (that.isAbove(this))
            return false;
        return true;
    }

    public boolean isLargerThan(GameObject that) {
        return getWidth() * getHeight() > that.getWidth() * that.getHeight();
    }
}
