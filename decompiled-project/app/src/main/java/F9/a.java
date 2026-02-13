package F9;

import A9.AbstractC0078e;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class a extends AbstractC0078e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7) {
        super(1);
        this.f4178c = i7;
    }

    @Override // A9.AbstractC0078e
    public final int i() {
        switch (this.f4178c) {
            case 0:
                return R.layout.item_loading_presenter;
            default:
                return R.layout.item_tv_loading_presenter;
        }
    }
}
