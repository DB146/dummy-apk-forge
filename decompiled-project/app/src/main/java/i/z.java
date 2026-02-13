package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class z implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f18164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18165b;

    /* renamed from: c, reason: collision with root package name */
    public Method f18166c;

    /* renamed from: d, reason: collision with root package name */
    public Context f18167d;

    public z(View view, String str) {
        this.f18164a = view;
        this.f18165b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f18166c == null) {
            View view2 = this.f18164a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f18165b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder n6 = X.c.n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    n6.append(view2.getClass());
                    n6.append(str);
                    throw new IllegalStateException(n6.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f18166c = method;
                        this.f18167d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f18166c.invoke(this.f18167d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
