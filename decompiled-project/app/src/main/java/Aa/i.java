package Aa;

import A9.S2;
import android.R;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import kb.EnumC1437b;
import y9.AbstractC2456A;
import y9.D;
import y9.F;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaybackActivity f1519b;

    public /* synthetic */ i(PlaybackActivity playbackActivity, int i7) {
        this.f1518a = i7;
        this.f1519b = playbackActivity;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        PlaybackActivity t5 = this.f1519b;
        Db.q qVar = Db.q.f3365a;
        switch (this.f1518a) {
            case 0:
                I i7 = (I) obj;
                int i10 = PlaybackActivity.f16206f0;
                if (i7 instanceof D) {
                    Throwable exception = ((D) i7).f27482a;
                    kotlin.jvm.internal.l.e(t5, "t");
                    kotlin.jvm.internal.l.e(exception, "exception");
                    new Handler(Looper.getMainLooper()).postDelayed(new S2(t5, 2), 5000L);
                    new Handler(Looper.getMainLooper()).postDelayed(new j(0, t5, i7), 2000L);
                }
                return qVar;
            case 1:
                int i11 = PlaybackActivity.f16206f0;
                if (((I) obj) instanceof G) {
                    t5.x().a();
                    boolean z8 = t5.j().D(R.id.content) instanceof AbstractC2456A;
                }
                return qVar;
            default:
                I i12 = (I) obj;
                String message = "Item: " + i12;
                PlaybackActivity t10 = this.f1519b;
                kotlin.jvm.internal.l.e(t10, "t");
                kotlin.jvm.internal.l.e(message, "message");
                if (!(i12 instanceof F)) {
                    if (i12 instanceof G) {
                        Intent intent = new Intent();
                        intent.putExtra("extra:playback_type", (Parcelable) l.f1526d);
                        G g = (G) i12;
                        intent.putExtra("extra:item_to_play", ((M9.b) g.f27483a).f6844a);
                        intent.putExtra("extra:extensions_id", ((M9.b) g.f27483a).f6845b);
                        t10.B(intent);
                        wa.h x2 = t10.x();
                        qb.b bVar = x2.j;
                        if (bVar != null) {
                            EnumC1437b.a(bVar);
                        }
                        x2.d().l(new Object());
                        t10.x().d().j(t10);
                    } else if (i12 instanceof D) {
                        ActivityUtilsKt.showErrorDialog$default(t10, null, ((D) i12).f27482a.getMessage(), null, null, null, false, false, false, null, null, 989, null);
                    }
                }
                return qVar;
        }
    }
}
