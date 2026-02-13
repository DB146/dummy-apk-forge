package sa;

import A9.I1;
import E.u;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.kt.apps.core.base.leanback.ImageCardView;
import i2.C1323k;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b extends T3.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i7) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f24212d = i7;
        this.f24213e = obj;
    }

    @Override // T3.i
    public final void i(Object obj) {
        switch (this.f24212d) {
            case 0:
                ((ImageCardView) this.f24213e).setBadgeImage((Drawable) obj);
                return;
            default:
                Bitmap bitmap = (Bitmap) obj;
                ua.e eVar = (ua.e) this.f24213e;
                u uVar = eVar.f24915e1;
                if (uVar == null) {
                    l.j("mDetailsBackground");
                    throw null;
                }
                uVar.f3502e = bitmap;
                C1323k c1323k = (C1323k) uVar.f3500c;
                Drawable drawable = c1323k == null ? null : c1323k.c(0).f16492b;
                if (drawable instanceof d2.g) {
                    ((d2.g) drawable).a((Bitmap) uVar.f3502e);
                }
                Q7.h hVar = eVar.f24917g1;
                if (hVar != null) {
                    ((I1) hVar.f8695b).d(((ArrayList) hVar.f8697d).size());
                    return;
                } else {
                    l.j("mAdapter");
                    throw null;
                }
        }
    }
}
