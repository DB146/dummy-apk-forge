package J8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f5716a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5717b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f5719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G8.z f5720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G8.z f5721f;
    public final /* synthetic */ boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5722h;

    public r(String str, Field field, Method method, G8.z zVar, G8.z zVar2, boolean z8, boolean z10) {
        this.f5719d = method;
        this.f5720e = zVar;
        this.f5721f = zVar2;
        this.g = z8;
        this.f5722h = z10;
        this.f5716a = str;
        this.f5717b = field;
        this.f5718c = field.getName();
    }

    public final void a(O8.b bVar, Object obj) {
        Object obj2;
        Field field = this.f5717b;
        Method method = this.f5719d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e2) {
                throw new Db.d(4, y.S.b("Accessor ", L8.c.d(method, false), " threw exception"), e2.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.U(this.f5716a);
        this.f5720e.c(bVar, obj2);
    }
}
