package Lc;

import Db.j;
import Eb.B;
import J3.o;
import W1.C;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.k;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class b extends C {

    /* renamed from: m0, reason: collision with root package name */
    public ImageView f6444m0;

    /* renamed from: n0, reason: collision with root package name */
    public ImageView f6445n0;

    @Override // W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        l.e(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_qr_code, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [J3.e, java.lang.Object] */
    @Override // W1.C
    public final void d0(View view, Bundle bundle) {
        String string;
        String string2;
        l.e(view, "view");
        this.f6444m0 = (ImageView) view.findViewById(R.id.qr_code);
        this.f6445n0 = (ImageView) view.findViewById(R.id.qr_code_center);
        if (bundle == null) {
            Bundle bundle2 = this.f10300u;
            string = bundle2 != null ? bundle2.getString("extra:generate_qr_code") : null;
        } else {
            string = bundle.getString("extra:generate_qr_code");
        }
        if (bundle == null) {
            Bundle bundle3 = this.f10300u;
            string2 = bundle3 != null ? bundle3.getString("extra:image_url") : null;
        } else {
            string2 = bundle.getString("extra:image_url");
        }
        Bundle bundle4 = this.f10300u;
        if ((bundle4 != null ? bundle4.getBoolean("extra:is_image_mode", false) : false) && string2 != null && string2.length() != 0) {
            k p10 = com.bumptech.glide.b.b(C()).c(this).p(string2);
            p10.getClass();
            k kVar = (k) p10.o(o.f5481c, new Object(), true);
            ImageView imageView = this.f6444m0;
            if (imageView == null) {
                l.j("qrCodeImageView");
                throw null;
            }
            kVar.D(imageView);
            ImageView imageView2 = this.f6445n0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            } else {
                l.j("qrCodeCenter");
                throw null;
            }
        }
        ImageView imageView3 = this.f6444m0;
        if (imageView3 == null) {
            l.j("qrCodeImageView");
            throw null;
        }
        int i7 = (int) (250 * F().getDisplayMetrics().scaledDensity);
        V8.b j = com.bumptech.glide.d.j(string, i7, i7, B.G(new j(P8.e.f8210c, 1)));
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
        imageView3.setImageBitmap(createBitmap);
        ImageView imageView4 = this.f6445n0;
        if (imageView4 == null) {
            l.j("qrCodeCenter");
            throw null;
        }
        imageView4.setVisibility(0);
    }
}
