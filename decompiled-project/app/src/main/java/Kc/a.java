package Kc;

import java.util.List;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import m4.v0;
import n4.C1703a;
import n4.j;
import n5.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC1394e, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6220b;

    public /* synthetic */ a(int i7, List list) {
        this.f6219a = i7;
        this.f6220b = list;
    }

    public /* synthetic */ a(C1703a c1703a, List list) {
        this.f6219a = 2;
        this.f6220b = list;
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        l.e(it, "it");
        return this.f6220b;
    }

    @Override // n5.i
    public void invoke(Object obj) {
        switch (this.f6219a) {
            case 1:
                ((v0) obj).q(this.f6220b);
                return;
            default:
                ((j) obj).getClass();
                return;
        }
    }
}
