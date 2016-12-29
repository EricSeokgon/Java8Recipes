package chapter8;

import java.awt.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by hadeslee on 2016-12-30.
 */
public class ExternalizableProgramSettings implements Externalizable {
    private Point locationOnScreen;
    private Dimension frameSize;
    private Color defaultFontColor;
    private String title;
    // Empty constructor, required for Externalizable implementors
    public ExternalizableProgramSettings() {
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(locationOnScreen.x);
        out.writeInt(locationOnScreen.y);
        out.writeInt(frameSize.width);
        out.writeInt(frameSize.height);
        out.writeInt(defaultFontColor.getRGB());
        out.writeUTF(title);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        locationOnScreen = new Point(in.readInt(), in.readInt());
        frameSize = new Dimension(in.readInt(), in.readInt());
        defaultFontColor = new Color(in.readInt());
        title = in.readUTF();
    }
// getters and setters omitted for brevity
}
