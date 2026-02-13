package J3;

import A0.G0;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: J3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337a implements A3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5459a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5460b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5461c;

    public /* synthetic */ C0337a(int i7, Object obj, Object obj2) {
        this.f5459a = i7;
        this.f5460b = obj;
        this.f5461c = obj2;
    }

    public C0337a(Resources resources, A3.n nVar) {
        this.f5459a = 0;
        this.f5461c = resources;
        this.f5460b = nVar;
    }

    @Override // A3.n
    public final boolean a(Object obj, A3.l lVar) {
        switch (this.f5459a) {
            case 0:
                return ((A3.n) this.f5460b).a(obj, lVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((q) this.f5460b).getClass();
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.InputStream] */
    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        boolean z8;
        x xVar;
        W3.e eVar;
        W3.e eVar2;
        switch (this.f5459a) {
            case 0:
                C3.A b2 = ((A3.n) this.f5460b).b(obj, i7, i10, lVar);
                if (b2 == null) {
                    return null;
                }
                return new C0340d((Resources) this.f5461c, b2);
            case 1:
                C3.A c10 = ((L3.c) this.f5460b).c((Uri) obj, lVar);
                if (c10 == null) {
                    return null;
                }
                return s.a((D3.a) this.f5461c, (Drawable) ((L3.b) c10).get(), i7, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof x) {
                    xVar = (x) inputStream;
                    z8 = false;
                } else {
                    z8 = true;
                    xVar = new x(inputStream, (D3.f) this.f5461c);
                }
                ArrayDeque arrayDeque = W3.e.f10600c;
                synchronized (arrayDeque) {
                    eVar = (W3.e) arrayDeque.poll();
                    eVar2 = eVar;
                }
                if (eVar == null) {
                    eVar2 = new InputStream();
                }
                W3.e eVar3 = eVar2;
                eVar3.f10601a = xVar;
                W3.l lVar2 = new W3.l(eVar3);
                q3.l lVar3 = new q3.l(12, xVar, eVar3, false);
                try {
                    q qVar = (q) this.f5460b;
                    C0340d a9 = qVar.a(new G0(lVar2, qVar.f5493d, qVar.f5492c), i7, i10, lVar, lVar3);
                    eVar3.f10602b = null;
                    eVar3.f10601a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(eVar3);
                    }
                    if (z8) {
                        xVar.n();
                    }
                    return a9;
                } catch (Throwable th) {
                    eVar3.f10602b = null;
                    eVar3.f10601a = null;
                    ArrayDeque arrayDeque2 = W3.e.f10600c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(eVar3);
                        if (z8) {
                            xVar.n();
                        }
                        throw th;
                    }
                }
        }
    }
}
