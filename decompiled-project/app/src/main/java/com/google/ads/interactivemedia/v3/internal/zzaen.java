package com.google.ads.interactivemedia.v3.internal;

import X.c;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class zzaen {
    private static final Logger zza = Logger.getLogger(zzaea.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzaef zzb(Class cls) {
        String j;
        ClassLoader classLoader = zzaen.class.getClassLoader();
        if (cls.equals(zzaef.class)) {
            j = zzb;
        } else {
            if (!cls.getPackage().equals(zzaen.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            j = c.j(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        return (zzaef) cls.cast(((zzaen) Class.forName(j, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzaen.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzaef) cls.cast(((zzaen) it.next()).zza()));
                } catch (ServiceConfigurationError e13) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (zzaef) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzaef) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        }
    }

    public abstract zzaef zza();
}
