package Bc;

import java.util.LinkedList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public final class p extends LinkedList {
    public final void b(Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i7 = 0; i7 < length; i7++) {
            Node item = childNodes.item(i7);
            if (item.getNodeType() != 8) {
                offer(item);
                b(item);
            }
        }
    }
}
