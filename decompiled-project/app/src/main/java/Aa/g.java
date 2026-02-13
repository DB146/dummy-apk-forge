package Aa;

import c.AbstractActivityC0867k;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;
import com.kt.apps.media.xemtv.ui.tv.settings.SettingsActivity;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import com.kt.apps.voiceselector.ui.VoiceSearchActivity;
import e.InterfaceC1073a;
import i.AbstractActivityC1287g;
import oa.C1827b;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;

/* loaded from: classes2.dex */
public final class g implements InterfaceC1073a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f1512b;

    public /* synthetic */ g(AbstractActivityC0867k abstractActivityC0867k, int i7) {
        this.f1511a = i7;
        this.f1512b = abstractActivityC0867k;
    }

    @Override // e.InterfaceC1073a
    public final void a(AbstractActivityC0867k abstractActivityC0867k) {
        switch (this.f1511a) {
            case 0:
                PlaybackActivity playbackActivity = (PlaybackActivity) this.f1512b;
                if (playbackActivity.f16210Y) {
                    return;
                }
                playbackActivity.f16210Y = true;
                playbackActivity.f16211Z = (RoomDataBase) ((C1827b) ((p) playbackActivity.e())).f22145a.k.get();
                return;
            case 1:
                TVSearchActivity tVSearchActivity = (TVSearchActivity) this.f1512b;
                if (tVSearchActivity.f16221Y) {
                    return;
                }
                tVSearchActivity.f16221Y = true;
                ((Ba.l) tVSearchActivity.e()).getClass();
                return;
            case 2:
                SettingsActivity settingsActivity = (SettingsActivity) this.f1512b;
                if (settingsActivity.f16226Y) {
                    return;
                }
                settingsActivity.f16226Y = true;
                ((Da.u) settingsActivity.e()).getClass();
                return;
            case 3:
                MobileMainActivity mobileMainActivity = (MobileMainActivity) this.f1512b;
                if (mobileMainActivity.L) {
                    return;
                }
                mobileMainActivity.L = true;
                oa.j jVar = ((C1827b) ((Ea.l) mobileMainActivity.e())).f22145a;
                mobileMainActivity.f16228M = jVar.b();
                mobileMainActivity.f16229N = (E9.h) jVar.f22165H.get();
                return;
            case 4:
                ShopeeProductDetailsActivity shopeeProductDetailsActivity = (ShopeeProductDetailsActivity) this.f1512b;
                if (shopeeProductDetailsActivity.f24559Q) {
                    return;
                }
                shopeeProductDetailsActivity.f24559Q = true;
                ((Mc.c) shopeeProductDetailsActivity.e()).getClass();
                return;
            case 5:
                VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity) this.f1512b;
                if (voiceSearchActivity.f16254Y) {
                    return;
                }
                voiceSearchActivity.f16254Y = true;
                voiceSearchActivity.f16255Z = (La.g) ((C1827b) ((Qa.i) voiceSearchActivity.e())).f22145a.f22161D.get();
                return;
            case 6:
                AbstractActivityC1287g abstractActivityC1287g = (AbstractActivityC1287g) this.f1512b;
                i.k l10 = abstractActivityC1287g.l();
                l10.a();
                ((q3.s) abstractActivityC1287g.f14050d.f23372c).o("androidx:appcompat");
                l10.c();
                return;
            default:
                MainActivity mainActivity = (MainActivity) this.f1512b;
                if (mainActivity.f16199Y) {
                    return;
                }
                mainActivity.f16199Y = true;
                oa.j jVar2 = ((C1827b) ((za.l) mainActivity.e())).f22145a;
                mainActivity.f16200Z = (R9.a) jVar2.j.get();
                return;
        }
    }
}
