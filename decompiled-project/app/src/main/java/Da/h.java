package Da;

import A9.N2;
import W1.C;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import pa.AbstractC1866d;
import tss.r.core.ads.ui.ProductDetailsActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3320c;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f3318a = i7;
        this.f3319b = obj;
        this.f3320c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Object obj;
        Object obj2 = this.f3320c;
        Object obj3 = this.f3319b;
        switch (this.f3318a) {
            case 0:
                AbstractC1866d abstractC1866d = (AbstractC1866d) ((k) obj3).o0();
                TVChannel tVChannel = (TVChannel) obj2;
                if (tVChannel != null) {
                    int channelNumber = tVChannel.getChannelNumber();
                    obj = Integer.valueOf(channelNumber);
                    if (channelNumber <= 0) {
                        obj = null;
                        break;
                    }
                }
                obj = "";
                abstractC1866d.f23231G.setText(String.valueOf(obj));
                return;
            case 1:
                k kVar = (k) obj3;
                ((ta.c) kVar.f3325p0.getValue()).saveChannelNumber((TVChannel) obj2, ((AbstractC1866d) kVar.o0()).f23231G.getText().toString());
                CharSequence text = ((AbstractC1866d) kVar.o0()).f23231G.getText();
                kotlin.jvm.internal.l.d(text, "getText(...)");
                if (ac.n.Z(ac.g.v0(text).toString()) != null) {
                    ActivityUtilsKt.showSuccessDialog$default((C) kVar, (Rb.a) new N2(kVar, 4), "Lưu thành công", (Integer) null, true, 4, (Object) null);
                    return;
                }
                return;
            default:
                int i7 = ProductDetailsActivity.f24545X;
                ((ProductDetailsActivity) obj2).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Jc.a) obj3).f5787w)));
                return;
        }
    }
}
