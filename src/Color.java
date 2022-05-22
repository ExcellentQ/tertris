//import javax.swing.border.Border;
//import java.awt.*;
//import java.awt.geom.Area;
//import java.awt.image.BufferedImage;
//
//public class Color implements Border {
//
//    private static final Color SHADOW_COLOR = Color.BLACK;
//    private static final float SHADOW_ALPHA = 0.5f;
//
//    private int size;
//    public void ShadowBorder(int size) {
//
//        if( size < 0 )
//            throw new IllegalArgumentException();
//
//        this.size = size;
//    }
//
//    @Override
//    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//
//        int widthFix = width - (size * 2);
//        int heightFix = height - (size * 2);
//
//        BufferedImage shadow = new BufferedImage(
//                size * 2 + width,
//                size * 2 + height,
//                BufferedImage.TYPE_INT_ARGB);
//        Graphics2D imgGraphics = shadow.createGraphics();
//        imgGraphics.setColor(SHADOW_COLOR);
//
//        imgGraphics.fillRect(size, size, widthFix, heightFix);
//
//        imgGraphics.setComposite(AlphaComposite.getInstance(
//                AlphaComposite.SRC_IN, SHADOW_ALPHA));
//        imgGraphics.fillRect(0, 0, shadow.getWidth(), shadow.getHeight());
//        imgGraphics.dispose();
//
//        GaussianFilter filter = new GaussianFilter(size * 2);
//        shadow = filter.filter(shadow, null);
//
//        Area shadowArea = new Area(new Rectangle(0, 0, width, height));
//        shadowArea.subtract(new Area(new Rectangle(0, 0, widthFix, heightFix)));
//
//        @SuppressWarnings("unchecked")
//        Graphics2D gg = (Graphics2D)g.create();
//        gg.setClip(shadowArea);
//        gg.drawImage(shadow, 0, 0, c);
//        gg.dispose();
//    }
//
//    @Override
//    public Insets getBorderInsets(Component c) {
//
//        return new Insets(0, 0, size * 2, size * 2);
//    }
//
//    @Override
//    public boolean isBorderOpaque() {
//
//        return false;
//    }
//
//}
