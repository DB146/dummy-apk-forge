package I2;

import java.util.Collections;
import java.util.Set;

/* renamed from: I2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332v {

    /* renamed from: a, reason: collision with root package name */
    public final q3.c f5206a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5207b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f5208c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5209d;

    public C0332v(q3.c observer, int[] tableIds, String[] tableNames) {
        Set singleton;
        kotlin.jvm.internal.l.e(observer, "observer");
        kotlin.jvm.internal.l.e(tableIds, "tableIds");
        kotlin.jvm.internal.l.e(tableNames, "tableNames");
        this.f5206a = observer;
        this.f5207b = tableIds;
        this.f5208c = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        if (tableNames.length == 0) {
            singleton = Eb.x.f3893a;
        } else {
            singleton = Collections.singleton(tableNames[0]);
            kotlin.jvm.internal.l.d(singleton, "singleton(...)");
        }
        this.f5209d = singleton;
    }
}
