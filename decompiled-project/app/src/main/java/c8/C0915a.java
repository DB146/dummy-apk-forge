package c8;

import a8.InterfaceC0787d;
import a8.InterfaceC0788e;
import java.util.Map;

/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0915a implements InterfaceC0787d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14440a;

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        switch (this.f14440a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC0788e interfaceC0788e = (InterfaceC0788e) obj2;
                interfaceC0788e.f(d8.f.g, entry.getKey());
                interfaceC0788e.f(d8.f.f16555h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
