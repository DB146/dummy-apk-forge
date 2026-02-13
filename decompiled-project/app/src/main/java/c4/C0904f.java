package c4;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: c4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904f {

    /* renamed from: a, reason: collision with root package name */
    public final q3.e f14342a;

    /* renamed from: b, reason: collision with root package name */
    public final C0902d f14343b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14344c;

    public C0904f(Context context, C0902d c0902d) {
        q3.e eVar = new q3.e(context, 24);
        this.f14344c = new HashMap();
        this.f14342a = eVar;
        this.f14343b = c0902d;
    }

    public final synchronized InterfaceC0906h a(String str) {
        if (this.f14344c.containsKey(str)) {
            return (InterfaceC0906h) this.f14344c.get(str);
        }
        CctBackendFactory m10 = this.f14342a.m(str);
        if (m10 == null) {
            return null;
        }
        C0902d c0902d = this.f14343b;
        InterfaceC0906h create = m10.create(new C0900b(c0902d.f14337a, c0902d.f14338b, c0902d.f14339c, str));
        this.f14344c.put(str, create);
        return create;
    }
}
