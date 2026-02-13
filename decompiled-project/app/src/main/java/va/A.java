package va;

import com.kt.apps.core.extensions.ExtensionsChannel;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class A implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f25264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExtensionsChannel f25265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25266d;

    public /* synthetic */ A(C c10, ExtensionsChannel extensionsChannel, String str, int i7) {
        this.f25263a = i7;
        this.f25264b = c10;
        this.f25265c = extensionsChannel;
        this.f25266d = str;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        ExtensionsChannel extensionsChannel = this.f25265c;
        String str = this.f25266d;
        C c10 = this.f25264b;
        switch (this.f25263a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                if (c10.f10272P) {
                    return;
                }
                int i7 = C.f25269v2;
                C.p1(c10, extensionsChannel, str);
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                if (c10.f10272P) {
                    return;
                }
                int i10 = C.f25269v2;
                C.p1(c10, extensionsChannel, str);
                return;
        }
    }
}
