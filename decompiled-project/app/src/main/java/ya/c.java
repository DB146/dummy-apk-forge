package ya;

import Db.q;
import android.content.Intent;
import com.kt.apps.media.xemtv.ui.tv.settings.SettingsActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f27554b;

    public /* synthetic */ c(int i7, j jVar) {
        this.f27553a = i7;
        this.f27554b = jVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f27553a) {
            case 0:
                this.f27554b.t0();
                return q.f3365a;
            default:
                j jVar = this.f27554b;
                jVar.n0(new Intent(jVar.C(), (Class<?>) SettingsActivity.class));
                return q.f3365a;
        }
    }
}
