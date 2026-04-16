interface IRegion {
    int getOffset();
    int getLength();
}

class Hover {
    public IRegion getHoverRegion(Object textViewer, int offset) {
        return new IRegion() {
            @Override
            public int getOffset() {
                return offset;
            }

            @Override
            public int getLength() {
                return 10; 
            }
        };
    }
}
public class HoverRegionExample {
    private Object fTextViewer;
    private Hover hover;

    public HoverRegionExample() {
        this.fTextViewer = new Object();
        this.hover = new Hover();
    }

    public void processHoverRegion(int offset) {
        final IRegion region = hover.getHoverRegion(fTextViewer, offset);
        System.out.println("Region offset: " + region.getOffset());
        System.out.println("Region length: " + region.getLength());
    }

    public static void main(String[] args) {
        HoverRegionExample example = new HoverRegionExample();
        int offset = 5;
        example.processHoverRegion(offset);
    }
}    