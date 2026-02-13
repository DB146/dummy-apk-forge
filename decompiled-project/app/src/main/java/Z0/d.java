package Z0;

import Db.q;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import y0.AbstractC2322G;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class d extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, ArrayList arrayList) {
        super(1);
        this.f12109a = i7;
        this.f12110b = arrayList;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12109a) {
            case 0:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                ArrayList arrayList = this.f12110b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    AbstractC2322G.g(abstractC2322G, (AbstractC2323H) arrayList.get(i7), 0, 0);
                }
                return q.f3365a;
            case 1:
                AbstractC2322G abstractC2322G2 = (AbstractC2322G) obj;
                ArrayList arrayList2 = this.f12110b;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    abstractC2322G2.d((AbstractC2323H) arrayList2.get(i10), 0, 0, 0.0f);
                }
                return q.f3365a;
            default:
                AbstractC2322G abstractC2322G3 = (AbstractC2322G) obj;
                ArrayList arrayList3 = this.f12110b;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    AbstractC2322G.h(abstractC2322G3, (AbstractC2323H) arrayList3.get(i11));
                }
                return q.f3365a;
        }
    }
}
