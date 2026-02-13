package m5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: m5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1616m extends InterfaceC1613j {
    void a(T t5);

    void close();

    long d(C1619p c1619p);

    default Map n() {
        return Collections.emptyMap();
    }

    Uri w();
}
