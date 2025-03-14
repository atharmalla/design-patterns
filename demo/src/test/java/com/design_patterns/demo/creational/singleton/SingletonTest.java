package com.design_patterns.demo.creational.singleton;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

/**
 * <p>This class provides several test case that test singleton construction.</p>
 *
 * <p>The first proves that multiple calls to the singleton getInstance object are the same when
 * called in the SAME thread. The second proves that multiple calls to the singleton getInstance
 * object are the same when called in the DIFFERENT thread.</p>
 *
 * @param <S> Supplier method generating singletons
 */
abstract class SingletonTest<S> {

    /**
     * The singleton's getInstance method.
     */
    private final Supplier<S> singletonInstanceMethod;

    /**
     * Create a new singleton test instance using the given 'getInstance' method.
     *
     * @param singletonInstanceMethod The singleton's getInstance method
     */
    public SingletonTest(final Supplier<S> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    /**
     * Test the singleton in a non-concurrent setting.
     */
    @Test
    void testMultipleCallsReturnTheSameObjectInSameThread() {
        // Create several instances in the same calling thread
        var instance1 = this.singletonInstanceMethod.get();
        var instance2 = this.singletonInstanceMethod.get();
        var instance3 = this.singletonInstanceMethod.get();
        // now check they are equal
        assertSame(instance1, instance2);
        assertSame(instance1, instance3);
        assertSame(instance2, instance3);
        System.out.println("Test Multiple Calls Return The Same Object In Same Thread");
    }

    /**
     * Test singleton instance in a concurrent setting.
     */
    @Test
    void testMultipleCallsReturnTheSameObjectInDifferentThreads() {
        assertTimeout(ofMillis(10000), () -> {
            // Create 10000 tasks and inside each callable instantiate the singleton class
            final var tasks = IntStream.range(0, 10000)
                    .<Callable<S>>mapToObj(i -> this.singletonInstanceMethod::get)
                    .collect(Collectors.toCollection(ArrayList::new));

            // Use up to 8 concurrent threads to handle the tasks
            final var executorService = Executors.newFixedThreadPool(8);
            final var results = executorService.invokeAll(tasks);

            // wait for all the threads to complete
            final var expectedInstance = this.singletonInstanceMethod.get();
            for (var res : results) {
                final var instance = res.get();
                assertNotNull(instance);
                assertSame(expectedInstance, instance);
            }

            // tidy up the executor
            executorService.shutdown();
        });

        System.out.println("test Multiple Calls Return The Same Object In Different Threads");


    }

}