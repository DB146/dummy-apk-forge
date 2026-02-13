package m1;

import android.content.pm.ShortcutInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1545c {
    public static String a(List list) {
        Iterator it = list.iterator();
        int i7 = -1;
        String str = null;
        while (it.hasNext()) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
            if (shortcutInfo.getRank() > i7) {
                str = shortcutInfo.getId();
                i7 = shortcutInfo.getRank();
            }
        }
        return str;
    }
}
