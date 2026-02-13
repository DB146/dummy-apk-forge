package E9;

import A9.C0163z1;
import A9.N2;
import Db.o;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final o f3812b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3813c;

    /* renamed from: d, reason: collision with root package name */
    public AudioFocusRequest f3814d;

    public e(Context context) {
        l.e(context, "context");
        this.f3811a = context;
        this.f3812b = android.support.v4.media.session.b.z(new C0163z1(18));
        this.f3813c = android.support.v4.media.session.b.z(new N2(this, 6));
    }

    public final void a() {
        Object systemService = this.f3811a.getSystemService("audio");
        l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(null);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f3814d;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }
}
