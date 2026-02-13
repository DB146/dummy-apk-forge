package m2;

import Q.AbstractC0499k0;
import com.bumptech.glide.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
import l2.InterfaceC1479x;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1546a {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0499k0 f19776a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if ((r1 instanceof Q.AbstractC0499k0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r1 = (Q.AbstractC0499k0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = null;
     */
    static {
        Object n6;
        try {
            ClassLoader classLoader = InterfaceC1479x.class.getClassLoader();
            l.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
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
        } catch (Throwable th) {
            n6 = c.n(th);
        }
        AbstractC0499k0 abstractC0499k0 = (AbstractC0499k0) (n6 instanceof Db.l ? null : n6);
        if (abstractC0499k0 == null) {
            abstractC0499k0 = new AbstractC0499k0(new com.kt.apps.core.utils.l(16));
        }
        f19776a = abstractC0499k0;
    }
}
