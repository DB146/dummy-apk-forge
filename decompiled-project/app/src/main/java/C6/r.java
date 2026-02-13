package C6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import q1.AbstractC1875a;
import y1.K;

/* loaded from: classes.dex */
public final class r extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f3008a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f3009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f3010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, int i7, String[] strArr) {
        super(context, i7, strArr);
        this.f3010c = sVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        s sVar = this.f3010c;
        ColorStateList colorStateList2 = sVar.f3018z;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3009b = colorStateList;
        if (sVar.f3017y != 0 && sVar.f3018z != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC1875a.f(sVar.f3018z.getColorForState(iArr3, 0), sVar.f3017y), AbstractC1875a.f(sVar.f3018z.getColorForState(iArr2, 0), sVar.f3017y), sVar.f3017y});
        }
        this.f3008a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i7, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.f3010c;
            Drawable drawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText()) && sVar.f3017y != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(sVar.f3017y);
                if (this.f3009b != null) {
                    colorDrawable.setTintList(this.f3008a);
                    drawable = new RippleDrawable(this.f3009b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = K.f26642a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
