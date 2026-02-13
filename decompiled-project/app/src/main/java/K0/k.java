package K0;

import A9.O0;
import java.util.ArrayList;
import y7.u0;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O0 f5888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(O0 o02, int i7) {
        super(0);
        this.f5887a = i7;
        this.f5888b = o02;
    }

    @Override // Rb.a
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.f5887a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f5888b.f926e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float c10 = ((n) obj3).f5922a.f8791w.c();
                    int s3 = u0.s(arrayList);
                    int i7 = 1;
                    if (1 <= s3) {
                        while (true) {
                            Object obj4 = arrayList.get(i7);
                            float c11 = ((n) obj4).f5922a.f8791w.c();
                            if (Float.compare(c10, c11) < 0) {
                                obj3 = obj4;
                                c10 = c11;
                            }
                            if (i7 != s3) {
                                i7++;
                            }
                        }
                    }
                    obj = obj3;
                }
                n nVar = (n) obj;
                return Float.valueOf(nVar != null ? nVar.f5922a.f8791w.c() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f5888b.f926e;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float b2 = ((n) obj5).f5922a.b();
                    int s10 = u0.s(arrayList2);
                    int i10 = 1;
                    if (1 <= s10) {
                        while (true) {
                            Object obj6 = arrayList2.get(i10);
                            float b10 = ((n) obj6).f5922a.b();
                            if (Float.compare(b2, b10) < 0) {
                                obj5 = obj6;
                                b2 = b10;
                            }
                            if (i10 != s10) {
                                i10++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                n nVar2 = (n) obj2;
                return Float.valueOf(nVar2 != null ? nVar2.f5922a.b() : 0.0f);
        }
    }
}
