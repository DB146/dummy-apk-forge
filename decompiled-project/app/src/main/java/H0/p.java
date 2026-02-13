package H0;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import d0.C1035c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4527a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f4516b = new p(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final p f4517c = new p(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final p f4518d = new p(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final p f4519e = new p(2, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final p f4520f = new p(2, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final p f4521u = new p(2, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final p f4522v = new p(2, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final p f4523w = new p(2, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final p f4524x = new p(2, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final p f4525y = new p(2, 9);

    /* renamed from: z, reason: collision with root package name */
    public static final p f4526z = new p(2, 10);

    /* renamed from: A, reason: collision with root package name */
    public static final p f4512A = new p(2, 11);

    /* renamed from: B, reason: collision with root package name */
    public static final p f4513B = new p(2, 12);

    /* renamed from: C, reason: collision with root package name */
    public static final p f4514C = new p(2, 13);

    /* renamed from: D, reason: collision with root package name */
    public static final p f4515D = new p(2, 14);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i7, int i10) {
        super(i7);
        this.f4527a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Db.c cVar;
        switch (this.f4527a) {
            case 0:
                return (C1035c) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList u02 = Eb.o.u0(list);
                u02.addAll(list2);
                return u02;
            case 2:
                return (d0.l) obj;
            case 3:
                return (Db.q) obj;
            case 4:
                return (Db.q) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                return (Db.q) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                f fVar = (f) obj;
                ((f) obj2).getClass();
                return fVar;
            case 9:
                return (String) obj;
            case 10:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList u03 = Eb.o.u0(list3);
                u03.addAll(list4);
                return u03;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Float f4 = (Float) obj;
                ((Number) obj2).floatValue();
                return f4;
            case 12:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 13:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f4460a) == null) {
                    str = aVar2.f4460a;
                }
                if (aVar == null || (cVar = aVar.f4461b) == null) {
                    cVar = aVar2.f4461b;
                }
                return new a(str, cVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
