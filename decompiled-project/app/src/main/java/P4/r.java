package P4;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import m5.C1619p;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f8129b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map f8130a;

    public r(Map map) {
        this.f8130a = map;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(C1619p c1619p) {
        this(Collections.emptyMap());
        Uri uri = c1619p.f20628a;
    }
}
