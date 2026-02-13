package v9;

import Db.j;
import Eb.B;
import J3.o;
import P8.e;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bumptech.glide.d;
import com.bumptech.glide.k;
import com.kt.apps.media.xemtv.beta.R;
import s9.AbstractC2000a;
import y9.AbstractC2464g;

/* loaded from: classes2.dex */
public final class c extends AbstractC2464g<AbstractC2000a> {
    @Override // y9.AbstractC2464g
    public final int p0() {
        return R.layout.fragment_qr_code;
    }

    @Override // y9.AbstractC2464g
    public final String q0() {
        return "FragmentQrCode";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [J3.e, java.lang.Object] */
    @Override // y9.AbstractC2464g
    public final void r0(Bundle bundle) {
        String string;
        String str = null;
        if (bundle == null) {
            Bundle bundle2 = this.f10300u;
            string = bundle2 != null ? bundle2.getString("extra:generate_qr_code") : null;
        } else {
            string = bundle.getString("extra:generate_qr_code");
        }
        if (bundle == null) {
            Bundle bundle3 = this.f10300u;
            if (bundle3 != null) {
                str = bundle3.getString("extra:image_url");
            }
        } else {
            str = bundle.getString("extra:image_url");
        }
        Bundle bundle4 = this.f10300u;
        if ((bundle4 != null ? bundle4.getBoolean("extra:is_image_mode", false) : false) && str != null && str.length() != 0) {
            k p10 = com.bumptech.glide.b.b(C()).c(this).p(str);
            p10.getClass();
            ((k) p10.o(o.f5481c, new Object(), true)).D(((AbstractC2000a) o0()).f24208C);
            ((AbstractC2000a) o0()).f24209D.setVisibility(8);
            return;
        }
        AbstractC2000a abstractC2000a = (AbstractC2000a) o0();
        int i7 = (int) (250 * F().getDisplayMetrics().scaledDensity);
        V8.b j = d.j(string, i7, i7, B.G(new j(e.f8210c, 1)));
        int i10 = j.f10194a;
        int i11 = j.f10195b;
        int[] iArr = new int[i10 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                iArr[(i12 * i10) + i13] = j.b(i13, i12) ? -16777216 : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i10, 0, 0, i10, i11);
        abstractC2000a.f24208C.setImageBitmap(createBitmap);
        ((AbstractC2000a) o0()).f24209D.setVisibility(0);
    }

    @Override // y9.AbstractC2464g
    public final void s0() {
    }
}
