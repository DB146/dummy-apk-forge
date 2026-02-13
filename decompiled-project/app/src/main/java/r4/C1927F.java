package r4;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import m5.C1619p;

/* renamed from: r4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927F extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final Map f23704a;

    public C1927F(C1619p c1619p, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f23704a = map;
    }
}
