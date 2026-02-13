package B0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import ec.C1116a;
import fc.InterfaceC1162i;

/* loaded from: classes.dex */
public final class s1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public C1116a f1972a;

    /* renamed from: b, reason: collision with root package name */
    public int f1973b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f1975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f1976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f1977f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ec.d f1978u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f1979v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(ContentResolver contentResolver, Uri uri, t1 t1Var, ec.d dVar, Context context, Hb.d dVar2) {
        super(2, dVar2);
        this.f1975d = contentResolver;
        this.f1976e = uri;
        this.f1977f = t1Var;
        this.f1978u = dVar;
        this.f1979v = context;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ec.d dVar2 = this.f1978u;
        s1 s1Var = new s1(this.f1975d, this.f1976e, this.f1977f, dVar2, this.f1979v, dVar);
        s1Var.f1974c = obj;
        return s1Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((InterfaceC1162i) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:14:0x0055, B:16:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC1162i interfaceC1162i;
        C1116a c1116a;
        InterfaceC1162i interfaceC1162i2;
        C1116a c1116a2;
        Object b2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f1973b;
        t1 t1Var = this.f1977f;
        ContentResolver contentResolver = this.f1975d;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                interfaceC1162i = (InterfaceC1162i) this.f1974c;
                contentResolver.registerContentObserver(this.f1976e, false, t1Var);
                c1116a = new C1116a(this.f1978u);
                this.f1974c = interfaceC1162i;
                this.f1972a = c1116a;
                this.f1973b = 1;
                b2 = c1116a.b(this);
                if (b2 == aVar) {
                }
            } else if (i7 == 1) {
                c1116a2 = this.f1972a;
                interfaceC1162i2 = (InterfaceC1162i) this.f1974c;
                com.bumptech.glide.c.c0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1116a2 = this.f1972a;
                interfaceC1162i2 = (InterfaceC1162i) this.f1974c;
                com.bumptech.glide.c.c0(obj);
                interfaceC1162i = interfaceC1162i2;
                c1116a = c1116a2;
                this.f1974c = interfaceC1162i;
                this.f1972a = c1116a;
                this.f1973b = 1;
                b2 = c1116a.b(this);
                if (b2 == aVar) {
                    return aVar;
                }
                C1116a c1116a3 = c1116a;
                interfaceC1162i2 = interfaceC1162i;
                obj = b2;
                c1116a2 = c1116a3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(t1Var);
                    return Db.q.f3365a;
                }
                c1116a2.c();
                Float f4 = new Float(Settings.Global.getFloat(this.f1979v.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f1974c = interfaceC1162i2;
                this.f1972a = c1116a2;
                this.f1973b = 2;
                if (interfaceC1162i2.emit(f4, this) == aVar) {
                    return aVar;
                }
                interfaceC1162i = interfaceC1162i2;
                c1116a = c1116a2;
                this.f1974c = interfaceC1162i;
                this.f1972a = c1116a;
                this.f1973b = 1;
                b2 = c1116a.b(this);
                if (b2 == aVar) {
                }
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(t1Var);
            throw th;
        }
    }
}
