package ea;

import java.util.List;
import jb.InterfaceC1393d;
import jb.InterfaceC1395f;
import kotlin.jvm.internal.l;

/* renamed from: ea.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1110e implements InterfaceC1395f, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1110e f16834a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C1110e f16835b = new Object();

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        return !it.isEmpty();
    }
}
