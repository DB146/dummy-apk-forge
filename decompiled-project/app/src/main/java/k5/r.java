package k5;

import P4.m0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18961a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18962b;

    public r(int i7, m0 m0Var, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC1705a.u("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f18961a = m0Var;
        this.f18962b = iArr;
    }
}
