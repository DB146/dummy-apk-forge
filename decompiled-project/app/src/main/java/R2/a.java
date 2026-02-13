package R2;

import Q.AbstractC0499k0;
import Q2.e;
import com.bumptech.glide.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0499k0 f8834a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof Q.AbstractC0499k0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (Q.AbstractC0499k0) r1;
     */
    static {
        Object n6;
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            l.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            l.d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (annotations[i7] instanceof Db.a) {
                    break;
                } else {
                    i7++;
                }
            }
            n6 = null;
        } catch (Throwable th) {
            n6 = c.n(th);
        }
        AbstractC0499k0 abstractC0499k0 = (AbstractC0499k0) (n6 instanceof Db.l ? null : n6);
        if (abstractC0499k0 == null) {
            abstractC0499k0 = new AbstractC0499k0(new I9.a(24));
        }
        f8834a = abstractC0499k0;
    }
}
