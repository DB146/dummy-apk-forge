package P9;

import Ab.e;
import Db.o;
import U9.v;
import U9.w;
import W9.j;
import com.kt.apps.core.storage.local.RoomDataBase;
import kotlin.jvm.internal.l;
import ob.C1842j;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDataBase f8253a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8254b;

    public b(RoomDataBase roomDataBase) {
        l.e(roomDataBase, "roomDataBase");
        this.f8253a = roomDataBase;
        final int i7 = 0;
        this.f8254b = android.support.v4.media.session.b.z(new Rb.a(this) { // from class: P9.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8252b;

            {
                this.f8252b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return this.f8252b.f8253a.H();
                    default:
                        return this.f8252b.f8253a.D();
                }
            }
        });
        final int i10 = 1;
        android.support.v4.media.session.b.z(new Rb.a(this) { // from class: P9.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8252b;

            {
                this.f8252b = this;
            }

            @Override // Rb.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return this.f8252b.f8253a.H();
                    default:
                        return this.f8252b.f8253a.D();
                }
            }
        });
    }

    public final C1842j a(j jVar) {
        w wVar = (w) this.f8254b.getValue();
        wVar.getClass();
        return android.support.v4.media.session.b.g(wVar.f9918a, new v(wVar, jVar, 1)).e(e.f1561c);
    }
}
