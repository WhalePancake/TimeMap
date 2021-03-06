package timemap;

import gui.frame.MainFrame;
import gui.map.WorldMap;
import gui.output.OutTextAreaWrapper;
import gui.time.TimeSelector;
import java.io.IOException;

public class TimeMap {

    public static void main(String[] args) throws IOException {
        MainFrame.getInstance().add(WorldMap.getInstance());
        MainFrame.getInstance().add(TimeSelector.getInstance());
        MainFrame.getInstance().add(OutTextAreaWrapper.getInstance());
        MainFrame.getInstance().setVisible();
    }
}
