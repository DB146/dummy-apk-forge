package o;

import androidx.appcompat.widget.AppCompatTextView;
import i1.C1290a;

/* loaded from: classes.dex */
public class U extends C1290a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f21435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 11);
        this.f21435c = appCompatTextView;
    }

    @Override // i1.C1290a, o.T
    public final void b(int i7) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i7);
    }

    @Override // i1.C1290a, o.T
    public final void e(int i7) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i7);
    }
}
