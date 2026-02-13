package Ra;

import A9.N2;
import C9.h;
import Db.j;
import Db.o;
import Eb.B;
import P4.C0463k;
import android.util.Log;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.UtilsKt;
import ga.C1203a;
import gb.f;
import java.util.Map;
import kotlin.jvm.internal.l;
import qb.n;
import tb.e;

/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8948b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8949c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8950d;

    public c(Pa.d dVar, b bVar) {
        super(3);
        this.f8949c = dVar;
        this.f8950d = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RoomDataBase roomDataBase) {
        super(3);
        l.e(roomDataBase, "roomDataBase");
        this.f8949c = roomDataBase;
        this.f8950d = android.support.v4.media.session.b.z(new N2(this, 21));
    }

    @Override // C9.h
    public final f v(Map map) {
        switch (this.f8948b) {
            case 0:
                String tag = UtilsKt.getTAG(this);
                StringBuilder sb2 = new StringBuilder("prepareExecute: ");
                Pa.d dVar = (Pa.d) this.f8949c;
                sb2.append(dVar);
                Log.d(tag, sb2.toString());
                dVar.getClass();
                b bVar = (b) this.f8950d;
                bVar.getClass();
                return new n(bVar.h(B.H(new j("extra:category", ""), new j("extra:action", ""), new j("extra:launchdata", ""))), new C0463k(this, 2), 1);
            default:
                U9.l lVar = (U9.l) ((o) this.f8950d).getValue();
                lVar.getClass();
                return new qb.d(new e(android.support.v4.media.session.b.k(lVar.f9899a, true, new Ba.o(lVar, 17)), C1203a.f17482b, 1).f(Ab.e.f1561c), 1);
        }
    }
}
