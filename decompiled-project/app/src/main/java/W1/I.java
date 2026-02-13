package W1;

import B0.n1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes.dex */
public final class I implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final U f10324a;

    public I(U u3) {
        this.f10324a = u3;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        a0 g;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        U u3 = this.f10324a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, u3);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V1.a.f9991a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z8 = C.class.isAssignableFrom(M.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z8 = false;
            }
            if (z8) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                C D10 = resourceId != -1 ? u3.D(resourceId) : null;
                if (D10 == null && string != null) {
                    D10 = u3.E(string);
                }
                if (D10 == null && id != -1) {
                    D10 = u3.D(id);
                }
                if (D10 == null) {
                    M J10 = u3.J();
                    context.getClassLoader();
                    D10 = J10.a(attributeValue);
                    D10.f10260C = true;
                    D10.L = resourceId != 0 ? resourceId : id;
                    D10.f10269M = id;
                    D10.f10270N = string;
                    D10.f10261D = true;
                    D10.f10265H = u3;
                    F f4 = u3.f10374w;
                    D10.f10266I = f4;
                    G g2 = f4.f10311b;
                    D10.f10275S = true;
                    if ((f4 != null ? f4.f10310a : null) != null) {
                        D10.f10275S = true;
                    }
                    g = u3.a(D10);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + D10 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (D10.f10261D) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    D10.f10261D = true;
                    D10.f10265H = u3;
                    F f10 = u3.f10374w;
                    D10.f10266I = f10;
                    G g10 = f10.f10311b;
                    D10.f10275S = true;
                    if ((f10 != null ? f10.f10310a : null) != null) {
                        D10.f10275S = true;
                    }
                    g = u3.g(D10);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + D10 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                X1.c cVar = X1.d.f10910a;
                X1.d.b(new X1.a(D10, "Attempting to use <fragment> tag to add fragment " + D10 + " to container " + viewGroup));
                X1.d.a(D10).getClass();
                D10.f10276T = viewGroup;
                g.k();
                g.j();
                View view2 = D10.f10277U;
                if (view2 == null) {
                    throw new IllegalStateException(y.S.b("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (D10.f10277U.getTag() == null) {
                    D10.f10277U.setTag(string);
                }
                D10.f10277U.addOnAttachStateChangeListener(new n1(this, g));
                return D10.f10277U;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
