package N;

import H2.O;
import java.util.ArrayList;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import y0.InterfaceC2332Q;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7090A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Integer f7091B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f7096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7097f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7098u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C.O f7099v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2332Q f7100w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7101x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f7102y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Integer f7103z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, O o10, int i7, int i10, C.O o11, InterfaceC2332Q interfaceC2332Q, int i11, int i12, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f7092a = arrayList;
        this.f7093b = arrayList2;
        this.f7094c = arrayList3;
        this.f7095d = arrayList4;
        this.f7096e = o10;
        this.f7097f = i7;
        this.f7098u = i10;
        this.f7099v = o11;
        this.f7100w = interfaceC2332Q;
        this.f7101x = i11;
        this.f7102y = i12;
        this.f7103z = num;
        this.f7090A = arrayList5;
        this.f7091B = num2;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        int i7;
        AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
        ArrayList arrayList = this.f7092a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            abstractC2322G.d((AbstractC2323H) arrayList.get(i10), 0, 0, 0.0f);
        }
        ArrayList arrayList2 = this.f7093b;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            abstractC2322G.d((AbstractC2323H) arrayList2.get(i11), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.f7094c;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (true) {
            i7 = this.f7101x;
            if (i12 >= size3) {
                break;
            }
            AbstractC2323H abstractC2323H = (AbstractC2323H) arrayList3.get(i12);
            int i13 = (this.f7097f - this.f7098u) / 2;
            InterfaceC2332Q interfaceC2332Q = this.f7100w;
            abstractC2322G.d(abstractC2323H, this.f7099v.d(interfaceC2332Q, interfaceC2332Q.getLayoutDirection()) + i13, i7 - this.f7102y, 0.0f);
            i12++;
        }
        ArrayList arrayList4 = this.f7095d;
        int size4 = arrayList4.size();
        for (int i14 = 0; i14 < size4; i14++) {
            AbstractC2323H abstractC2323H2 = (AbstractC2323H) arrayList4.get(i14);
            Integer num = this.f7103z;
            abstractC2322G.d(abstractC2323H2, 0, i7 - (num != null ? num.intValue() : 0), 0.0f);
        }
        O o10 = this.f7096e;
        if (o10 != null) {
            ArrayList arrayList5 = this.f7090A;
            int size5 = arrayList5.size();
            for (int i15 = 0; i15 < size5; i15++) {
                AbstractC2323H abstractC2323H3 = (AbstractC2323H) arrayList5.get(i15);
                Integer num2 = this.f7091B;
                kotlin.jvm.internal.l.b(num2);
                abstractC2322G.d(abstractC2323H3, o10.f4603b, i7 - num2.intValue(), 0.0f);
            }
        }
        return Db.q.f3365a;
    }
}
