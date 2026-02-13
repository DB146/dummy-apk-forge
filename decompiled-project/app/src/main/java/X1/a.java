package X1;

import W1.C;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final C f10902a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C fragment, String str) {
        super(str);
        l.e(fragment, "fragment");
        this.f10902a = fragment;
    }
}
