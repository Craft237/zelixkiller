package me.nov.zelixkiller.transformer;

import me.nov.zelixkiller.JarArchive;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;

public abstract class Transformer implements Opcodes {
    public abstract boolean isAffected(ClassNode cn);

    public abstract void transform(JarArchive ja, ClassNode cn);

    public abstract void postTransform();
}
