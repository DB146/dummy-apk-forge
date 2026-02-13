package y1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2354b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f26679c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f26680a;

    /* renamed from: b, reason: collision with root package name */
    public final C2353a f26681b;

    public C2354b() {
        this(f26679c);
    }

    public C2354b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f26680a = accessibilityDelegate;
        this.f26681b = new C2353a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f26680a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C2355c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f26680a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C2355c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f26680a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, z1.e eVar) {
        this.f26680a.onInitializeAccessibilityNodeInfo(view, eVar.f28173a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f26680a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f26680a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i7, Bundle bundle) {
        boolean z8;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            z1.d dVar = (z1.d) list.get(i10);
            if (dVar.a() == i7) {
                z1.o oVar = dVar.f28171d;
                if (oVar != null) {
                    Class cls = dVar.f28170c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z8 = oVar.d(view);
                }
            } else {
                i10++;
            }
        }
        z8 = false;
        if (!z8) {
            z8 = this.f26680a.performAccessibilityAction(view, i7, bundle);
        }
        if (z8 || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z8;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i12 = 0;
            while (true) {
                if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
                i12++;
            }
        }
        return z10;
    }

    public void h(View view, int i7) {
        this.f26680a.sendAccessibilityEvent(view, i7);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f26680a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
