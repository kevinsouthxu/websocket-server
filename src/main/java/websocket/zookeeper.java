package websocket;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class zookeeper {
    private static ZooKeeper zooKeeper = null;

    static {
        try {
            zooKeeper = new ZooKeeper("123.60.25.41:2181", 10000, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getDataTest() {
        try {
//            ZooKeeper zooKeeper = new ZooKeeper("123.60.25.41:2181", 10000, null);
            String path = "/test1";
            String data = new String(zooKeeper.getData(path, null, new Stat()));
            System.out.println("receive from zookeeper:" + data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
