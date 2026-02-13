package Aa;

import W1.C;
import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import m4.C1549C;
import y9.AbstractC2456A;

/* loaded from: classes2.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaybackActivity f1529a;

    public n(PlaybackActivity playbackActivity) {
        this.f1529a = playbackActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r3.f10272P == false) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !kotlin.jvm.internal.l.a(intent.getAction(), "android.intent.action.TIME_TICK")) {
            return;
        }
        C D10 = this.f1529a.j().D(R.id.content);
        if (D10 instanceof AbstractC2456A) {
            AbstractC2456A abstractC2456A = (AbstractC2456A) D10;
            if (!abstractC2456A.L()) {
            }
        }
        D10 = null;
        if (D10 != null) {
            AbstractC2456A abstractC2456A2 = (AbstractC2456A) D10;
            C1549C c1549c = abstractC2456A2.H0().f3807c;
            if (c1549c == null || !c1549c.s()) {
                return;
            }
            abstractC2456A2.W0();
        }
    }
}
