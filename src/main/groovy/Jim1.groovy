import static org.slf4j.LoggerFactory.getLogger

def logger = getLogger(Jim1)

['Bearer ABCDEFGHIJKLMNOP', 'Basic 1234567890123456', 'Stuff', 'Stuff\nBasic 1234567890123456'].each {
    logger.info it
}
