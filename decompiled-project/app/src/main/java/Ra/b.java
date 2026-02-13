package Ra;

import Ab.e;
import C9.h;
import U9.k;
import android.content.Context;
import android.util.Log;
import com.kt.apps.core.utils.UtilsKt;
import ga.C1203a;
import gb.f;
import java.util.Map;
import kotlin.jvm.internal.l;
import qb.g;

/* loaded from: classes2.dex */
public final class b extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8946b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(P9.c _repository) {
        super(3);
        l.e(_repository, "_repository");
        this.f8947c = _repository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(3);
        l.e(context, "context");
        this.f8947c = context;
    }

    @Override // C9.h
    public final f v(Map map) {
        switch (this.f8946b) {
            case 0:
                Object obj = map.get("extra:category");
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    return qb.h.f23612a;
                }
                Object obj2 = map.get("extra:action");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 == null) {
                    str2 = "android.intent.action.MAIN";
                }
                Object obj3 = map.get("extra:launchdata");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                if (str3 == null) {
                    str3 = "";
                }
                Log.d(UtilsKt.getTAG(this), "prepareExecute AppQuery: " + map);
                return new qb.d(new a(this, str2, str, str3), 0);
            default:
                Object obj4 = map.get("extra:item_id");
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                qb.h hVar = qb.h.f23612a;
                if (str4 == null) {
                    return hVar;
                }
                Object obj5 = map.get("extra:link_play");
                String str5 = obj5 instanceof String ? (String) obj5 : null;
                if (str5 == null) {
                    return hVar;
                }
                P9.c cVar = (P9.c) this.f8947c;
                cVar.getClass();
                U9.l lVar = (U9.l) cVar.f8257c.getValue();
                lVar.getClass();
                return new g(1, android.support.v4.media.session.b.k(lVar.f9899a, true, new k(str4, str5, lVar, 0)).f(e.f1561c), C1203a.f17481a);
        }
    }
}
